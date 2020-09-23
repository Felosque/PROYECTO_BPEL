package clientecolegiobepel;

import bpelcolegioca.BPELColegioCAService1;
import bpelcolegioca.InvokeColegioEstudiantePortType;

public class ServicioColegio {
    
    BPELColegioCAService1 bPELColegioCAService1 = new BPELColegioCAService1();
    InvokeColegioEstudiantePortType servicioColegio = bPELColegioCAService1.getCasaPort1();
    
    public ServicioColegio() {
        super();
    }
    
    public String darNotaEstudiante(String pDocumento){
        return servicioColegio.invokeColegioEstudianteOperation(pDocumento).toString();
    }
    
}
