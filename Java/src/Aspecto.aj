import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;


public aspect Aspecto{
	Map<Color, String> map= getConfig();
	
	private Map<Color, String> getConfig() {
		Map<Color, String> output= new HashMap<>();
		output.put(Color.yellow, "Amarillo");
		output.put(Color.blue, "Azul");
		output.put(Color.red, "Rojo");
		return output;
	}
	pointcut success(Color c): args(c) && call(** cambioAmarillo(**));
	after(Color c): success(c){
		imprimir(c);
	}
	
	void imprimir(Color color) {
		System.out.println(map.get(color));
	}
	
}
	
	
	
	
	
	