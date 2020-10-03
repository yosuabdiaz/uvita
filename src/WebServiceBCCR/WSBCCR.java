    package WebServiceBCCR;

public class WSBCCR {

    public static String obtenerIndicadoresEconomicosXML(java.lang.String tcIndicador, java.lang.String tcFechaInicio, java.lang.String tcFechaFinal, java.lang.String tcNombre, java.lang.String tnSubNiveles) {
        cr.fi.bccr.sdde.ws.WsIndicadoresEconomicos service = new cr.fi.bccr.sdde.ws.WsIndicadoresEconomicos();
        cr.fi.bccr.sdde.ws.WsIndicadoresEconomicosSoap port = service.getWsIndicadoresEconomicosSoap();
        return port.obtenerIndicadoresEconomicosXML(tcIndicador, tcFechaInicio, tcFechaFinal, tcNombre, tnSubNiveles);
    }
   
    
}
