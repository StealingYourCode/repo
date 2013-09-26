package xml.example;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class CarXMLStorage implements Storage<Car> {

	@Override
	public void create(Car item){
		//File xmlFile = new File("H:\\briefcase\\JAVA\\workspaceJ213\\XMLExample\\Cars.xml");
		File xmlFile = new File("Cars.xml");
		//logger.debug("Just opened xmlFile");
		SAXBuilder builder = new SAXBuilder();
		XMLOutputter xmlOutputter = new XMLOutputter();		
		xmlOutputter.setFormat(Format.getCompactFormat());
		Document document;
		try {
			document = (Document)builder.build(xmlFile);
		} catch (JDOMException e) {
			
			document = new Document(new Element("Cars"));
	
		} catch (IOException e) {
			
			document = new Document(new Element("Cars"));
		}catch (Exception e) {
			
			document = new Document(new Element("Cars"));
		}
		Element root = document.getRootElement();
		Element child = new Element("Car");
		root.addContent(child);
		try {
			Element carIdElement = new Element("carId");
			//itemElement.setAttribute("datatype", dto.getType().getName());
			carIdElement.addContent(Integer.toString(item.getCarId()));
			child.addContent(carIdElement);
			Element carMakeElement = new Element("carMake");
			carMakeElement.addContent(item.getMake());
			child.addContent(carMakeElement);
			Element carModelElement = new Element("carModel");
			carModelElement.addContent(item.getModel());
			child.addContent(carModelElement);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		try {
			xmlOutputter.output(document, new FileWriter(xmlFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Car> read(String[] field, String[] criteria) {
		ArrayList<Car> localList= new ArrayList<Car>();
		
		//File xmlFile = new File("H:\\briefcase\\JAVA\\workspaceJ213\\XMLExample\\Cars.xml");
		File xmlFile = new File("Cars.xml");
		SAXBuilder builder = new SAXBuilder();
		Document document;
		try {
			document = (Document)builder.build(xmlFile);
		}catch (Exception e) {
			
			return localList;
		}		
		
		Element root = document.getRootElement();
		List<Element> elements = root.getChildren();
		
		for(Element e : elements)
		{
			List<Element> alE = e.getContent();
			
			String carid="", make="", model="";
			
			for(Element carinfo: alE)
			{
				if (carinfo.getName().equals("carId"))
				{
					carid = carinfo.getText();
				}
				else if (carinfo.getName().equals("carMake"))
				{
					make = carinfo.getText();
				}
				else
				{
					model = carinfo.getText();
				}
			}
			
			localList.add(new Car(Integer.parseInt(carid), make, model));
		}
		
		return localList;
	}

	@Override
	public void update(Car OldItem, Car NewItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Car item) {
		// TODO Auto-generated method stub
		
	}

}
