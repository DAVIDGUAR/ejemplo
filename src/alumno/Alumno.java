
package alumno;

/**
 *
 * @author drodriguezguardiola
 */
public class Alumno {
    
   private String nome;
    private int nota;

    public Alumno(String nom,int not) {
        nome=nom;
        nota=not;
        
        
        
    }
    
    
      public Alumno() {
    }

    public void setNome(String nom) {
        this.nome = nom;
    }

  

    public void setNota(int not) {
        this.nota = not;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }
   
    
    
    
    
    
    
    
    
}
