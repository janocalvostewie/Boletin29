package boletin29;

/**
 *
 * @author jano
 */
public abstract class Barco {
    protected int eslora;
    protected String matricula;
    protected int tipo;
    
    
    /*
    *GETTERS
    */
    public int getEslora(){return eslora;}
    public String getMatricula(){return matricula;}
    public int getTipo(){return tipo;}
    
    
    /*
    *SETTERS
    */
    public void setEslora(int eslora){this.eslora=eslora;}
    public void setMatricula(String matricula){this.matricula=matricula;}
    
    
    /*
    *MÉTODOS
    */
    public float modulo(int dias){
        float resultado=10*eslora;
        return resultado;
    }
    
    
    @Override
    public String  toString(){
    String cadena="Eslora: "+eslora+"\nMatrícula: "+matricula;
    return cadena;
    }
    
    
    
}