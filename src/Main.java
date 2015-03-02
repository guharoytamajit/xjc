import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.dto.messages.Note;




public class Main {
public static void main(String[] args) throws JAXBException {
	Note note = new Note();
	System.out.println();
	
	JAXBContext context = JAXBContext.newInstance(Note.class);
	Marshaller marshaller = context.createMarshaller();
	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
marshaller.marshal(note, System.out);
}
}
