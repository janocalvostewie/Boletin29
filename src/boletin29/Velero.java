package boletin29;

/**
 *
 * @author jano
 */
public class Velero extends Barco{
    private int mastiles;
    private int tipo=1;
    
    
    public Velero(int eslora, String matricula, int mastiles){
    this.eslora=eslora;
    this.matricula=matricula;
    this.mastiles=mastiles;
    }
    
    public void setMastiles(int mastiles){this.mastiles=mastiles;}
    public int getMastiles(){return mastiles;}
    public int getTipo(){return tipo;}
    
    
    @Override
       public float modulo(int dias){
        float resultado=dias*((10*eslora)*mastiles);
        return resultado;
    }
       
         @Override
    public String  toString(){
    String cadena="Eslora: "+eslora+"\nMatrícula: "+matricula+"\nMástiles: "+mastiles+"\n";
    return cadena;
    }
}