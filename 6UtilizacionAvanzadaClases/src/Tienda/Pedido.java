/**
 * 
 */
package Tienda;

import java.io.IOException;
import java.time.LocalDate;

import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.CIDFontMapping;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/**
 * @author alumno
 *
 */
public class Pedido {
	protected static int incremento = 0;
	protected int codigo;
	protected LocalDate fecha;
	protected double total; //campo calculado, ni en setter
	protected Cliente cliente;
	protected ArrayList<LineaPedido> Lineas;
	
	public Pedido(Cliente cl) {
		Pedido.incremento++;
		codigo = Pedido.incremento;
		fecha = LocalDate.now();
		cliente = cl;
		Lineas = new ArrayList<>();
		this.total = 0;
	}
	
	public Pedido() {
		Pedido.incremento++;
		codigo = Pedido.incremento;
		fecha = LocalDate.now();
		Lineas = new ArrayList<>();
	}
	
	/**
	 * 
	 * @return devuelve el precio total, sumando cada linea pedido y
	 * descontando el descuento
	 */
	public double total() {
		//el total se va actualizando cada vez que a?ado una nueva lineaPedido
		//con el metodo nuevaLinea
		double total=0;
		for(LineaPedido li : Lineas) {
			total += (li.getProducto().getPrecio() * li.getCantidad()) * li.getProducto().getIva();
		}
		
		return total - cliente.descuento();
	}
	
	protected ArrayList<LineaPedido> getLineas() {
		return Lineas;
	}
	
	/**
	 * metodo que a?ade una linea de pedido a un pedido
	 * @param lp
	 */
	public void nuevaLinea (LineaPedido lp) {
		//si hay una lina de pedido ya, con el mismo producto
		//lo que hago es actualizar la cantidad de esa linea del pedido
		boolean encontrado=false;
		for (LineaPedido lp2: Lineas) {
			if (lp.getProducto().equals(lp2.getProducto())) {
				lp2.setCantidad(lp2.getCantidad() + lp2.getCantidad());
				encontrado=true;
				this.total += lp.subtotal();
			}
		}
		
		if (!encontrado) {
			Lineas.add(lp);
			total = lp.subtotal();
		}
		
		
	}

	@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pedido: ");
        builder.append(codigo);
        builder.append("\n");
        for (LineaPedido lineas: Lineas) {
            builder.append(lineas.getProducto().getCodigo());
            builder.append(" precio: ");
            builder.append(lineas.getProducto().getPrecio());
            builder.append(" cantidad: ");
            builder.append(lineas.getCantidad());
            builder.append(" subtotal: ");
            builder.append(lineas.subtotal());
            builder.append("? \n");
        }
        builder.append("Total (iva inc.)=");
        builder.append(total());
        return builder.toString();
    }
	
	/**
	 * metodo que crea un pdf como los datos del pedido y los datos de compra del perdido
	 * @throws IOException
	 */
	public void toPdf() throws IOException {
		try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage(PDRectangle.A6);
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // Text
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 32);
            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 52);
            contentStream.showText("Pedido: "+ this.codigo );
            contentStream.endText();
            //contentStream.newLineAtOffset(0, -15);
            
            if (cliente != null) { //Si tiene cliente asociado pintamos los datos
            	contentStream.beginText();
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 80);
                contentStream.showText("Cliente: " + cliente.getDni() + ", " + cliente.getApellidos() + " " + cliente.getNombre());
                contentStream.newLineAtOffset(0, -15);
                contentStream.showText("Direccion: " + cliente.getDireccion() + ", " + cliente.getLocalidad());
                contentStream.endText();
            }
            
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_ITALIC, 8);
            contentStream.newLineAtOffset( 20, 300);
            for (LineaPedido li : Lineas) {
            	contentStream.showText("Producto: " + li.getProducto().getCodigo()+" - Precio: " + li.getProducto().getPrecio());
            	contentStream.showText(" ------------------------- ");
            	contentStream.showText("Cantidad: " + li.getCantidad()+" =  " + li.subtotal());
            	contentStream.newLineAtOffset(0, -15);
			}
            contentStream.showText("Descuento: "+cliente.descuento());
            contentStream.showText(" ------------------------------------------------- ");
            contentStream.showText("Total a pagar: "+total());
            contentStream.endText();

            contentStream.close();

            document.save("document.pdf");
        }
	}
	
}
