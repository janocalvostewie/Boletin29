package boletin29;

/**
 *
 * @author jano
 */
public class Yate extends Barco {
    private int cv;
    private int camarotes;
    private int tipo=2;
    
    
    public Yate(int eslora, String matricula,int cv, int camarotes){
    this.eslora=eslora;
    this.matricula=matricula;
    this.cv=cv;
    this.camarotes=camarotes;
    }
    
    public void setCv(int cv){this.cv=cv;}
    public void setCamarotes(int camarotes){this.camarotes=camarotes;}
    
    public float getCv(){return cv;}
    public int getCamarotes(){return camarotes;}
    public int getTipo(){return tipo;}
    
    @Override
     public float modulo(int dias){
        float resultado=dias*((10*eslora)+(cv+camarotes));
        return resultado;
    }
     
       @Override
    public String  toString(){
    String cadena="Eslora: "+eslora+"\nMatrícula: "+matricula+"\nCV: "+cv+"\nCamarotes: "+camarotes+"\n";
    return cadena;
    }
}