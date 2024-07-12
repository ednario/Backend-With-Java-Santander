package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
  private Map<LocalDate, Evento> eventos;

  public AgendaEvento() {
    this.eventos = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, Evento evento) {
    this.eventos.put(data, evento);
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);

    System.out.println("Agenda de eventos: " + eventosOrdenados);
  }

  public void proximoEvento() {
    Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);

    LocalDate dataProximoEvento = eventosOrdenados.keySet().iterator().next();
    Evento proximoEvento = eventosOrdenados.get(dataProximoEvento);

    System.out.println("Próximo evento: " + proximoEvento + " na data " + dataProximoEvento);
  }
}
