
/**
 *  Representa a una fila de la hoja de cálculo
 *  Toda fila tiene un identificador y en ella
 *  se anotan la fecha, los ingresos y los gastos correspondientes a un
 *  apunte  contable  de una empresa
 * 
 * @julenbaztarrica
 *  
 */
public class Fila
{
    private String id;
    private Fecha fecha;
    private double ingresos;
    private double gastos;

    /**
     * Constructor  
     */
    public Fila(String id, Fecha fecha)    {
         id = id;
         fecha = new Fecha (1,1,2020);
         ingresos = 0;
         gastos = 0;
    }

    /**
     * Constructor  
     */
    public Fila(String id, Fecha fecha, double ingresos, double gastos)    {
          id = id;
          fecha = fecha;
          ingresos = ingresos;
          gastos = gastos;

    }
    
    /**
     * accesor para el id de la fila
     */
    public String getId() {
        return id;

    }


    /**
     * accesor para la fecha
     */
    public Fecha getFecha() {
        return fecha;

    }

    /**
     * accesor para los ingresos
     */
    public double getIngresos() {
        return ingresos;

    }

    /**
     * accesor para los gastos
     */
    public double getGastos() {
        return gastos;

    }

    /**
     * calcula y devuelve el beneficio
     */
    public double getBeneficio() {
        return ingresos - gastos;

    }
    
    /**
     * obtiene una copia idéntica a la fila actual.
     * La fecha que incluye la fila duplicada también es una copia
     * 
     */
    public Fila duplicar() {
        Fila duplicar = new Fila(id,fecha,ingresos,gastos);
        return duplicar;
    }

    /**
     * Representación textual de una fila
     * (leer enunciado)
     */
    public String toString() {
        return null;
    }

     

}
