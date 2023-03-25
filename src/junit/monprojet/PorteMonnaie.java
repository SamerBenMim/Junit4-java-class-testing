package junit.monprojet;
import java.util.HashMap;
public class PorteMonnaie {
    private HashMap<String, Integer> contenu;

    public HashMap<String, Integer> getContenu() {
        return contenu;
    }

    public PorteMonnaie() {
        contenu = new HashMap<String, Integer>();
    }

    public void ajouteSomme(SommeArgent sa) {
        if (getContenu().get(sa.getUnite()) == null) {
            getContenu().put(sa.getUnite(), sa.getQuantite());
        } else {
            getContenu().put(sa.getUnite(), sa.getQuantite() + getContenu().get(sa.getUnite()));
        }
    }

    public boolean equals(Object o){

        if (o == this.getContenu()) {
            return true;
        }

        if (((PorteMonnaie)o).getContenu().size() != this.getContenu().size()) {
            return false;
        }
        for (HashMap.Entry<String, Integer> entry : getContenu().entrySet()) {
            if(((PorteMonnaie)o).getContenu().get(entry.getKey())==null){
                return false;
            }
            else {
                if (  ((PorteMonnaie)o).getContenu().get(entry.getKey()) != entry.getValue() ) return false;
            }
        }
    return true;
    }

    public String toString() {
        String s = "Vous disposer de : ";
        for (HashMap.Entry<String, Integer> entry : getContenu().entrySet()) {
            s+= entry.getValue()+""+entry.getKey()+", ";
        }
        return s;
    }
}