package ar.edu.unq.po2.tp6.ej2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ActividadSemanal {
	
	private DiaDeLaSemana dia;
	private int horaDeInicio;
	private int duracion;
	private Deportes deporte;
	
	
	public DiaDeLaSemana getDia() {
		return dia;
	}

	public int getHoraDeInicio() {
		return horaDeInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public Deportes getDeporte() {
		return deporte;
	}

	public int calcularCosto(){
		int costoPorHora;
		if(dia == DiaDeLaSemana.LUNES || dia == DiaDeLaSemana.MARTES || dia == DiaDeLaSemana.MIERCOLES) {
			costoPorHora = 500;
		} else {
			costoPorHora = 1000;
		}
		
		int costoTTiempo = costoPorHora * this.duracion; 
		int costoComplejidad = deporte.getComplejidad() * 200;
		
		return costoTTiempo + costoComplejidad;
	}
	
	public List<ActividadSemanal> todasLasActividadesDelDeporte_(List<ActividadSemanal> actividades, Deportes deporte){
		
		return actividades.stream().filter(actividad -> actividad.getDeporte() == deporte).toList();
	}
	
	public List<ActividadSemanal> todasLasActividadesDeComplejidad_(List<ActividadSemanal> actividades, int complejidad){
		
		return actividades.stream().filter(actividad -> actividad.getDeporte().getComplejidad() == complejidad).toList();
	}
	
	public int cantidadHorasTotalesPorSemana(List<ActividadSemanal> actividades) {
		
		return actividades.stream().mapToInt(ActividadSemanal::getDuracion).sum();
	}
	
	public Optional<ActividadSemanal> actividadDeMenorCosto(List<ActividadSemanal> actividades, Deportes deporte) {
		
		return actividades.stream().filter(activdad -> activdad.getDeporte() == deporte).min(Comparator.comparingInt(ActividadSemanal::calcularCosto));
	}
	
	public Map<Deportes, ActividadSemanal> laMasEconomicaDeCadaActividad(List<ActividadSemanal> actividades){
		
		return actividades.stream().collect(Collectors.groupingBy(ActividadSemanal::getDeporte,Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingInt(ActividadSemanal::calcularCosto)),
                Optional::get)));
	}
	
	public String toString() {
		return "Deporte:"+deporte+".Dia:"+dia+".A las:"+horaDeInicio+".Duracion:"+duracion+" hora(s).";
	}

	public void imprimirActividades(List<ActividadSemanal> actividades) {
		actividades.forEach(System.out::println);
	}
	
}
