package boletin29;

/**
 *
 * @author jano
 */
public class Deportivo extends Barco{
    private int cv;
    private int tipo=3;
    
    
     public Deportivo(int eslora, String matricula,int cv){
    this.eslora=eslora;
    this.matricula=matricula;
    this.cv=cv;
    
    }
    
    public void setCv(int cv){this.cv=cv;}
    
    
    public int getCv(){return cv;}
    public int getTipo(){return tipo;}
    
    
    
    @Override
     public float modulo(int dias){
        float resultado=dias*((10*eslora)+cv);
        return resultado;
    }
    
       @Override
    public String  toString(){
    String cadena="Eslora: "+eslora+"\nMatrícula: "+matricula+"\nCV: "+cv+"\n";
    return cadena;
    }
     
}