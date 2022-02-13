package EstructuraDeDatos.Collection.Listas;

import java.util.*;

public class Lista {


    public static void main(String[] args) {


        Lista list = new Lista();
        String [] usuario = new String[]{"ab", "c", "d", "e"};
        String [] abecdario = new String[]{"a", "a", "d", "e","1","2","3","3"};
        list.ordenaLista(usuario );
        list.ordenarset(abecdario);
        list.usoIterator(usuario);


    }

    private void usoIterator(String[] usuario) {
        Set<String> abcd = new HashSet<>(Arrays.asList(usuario));
        //Iterator<String>miiter
    }

    private void ordenarset(String[] abecedario) {
        Set<String> abcd = new HashSet<>(Arrays.asList(abecedario));
        for (String abc:
                abcd
             ) {
            System.out.println("Lista.ordenarset  --->"+abc);
        }
    }

    private void ordenaLista(String[] usuario) {

        List<String> usrs = new ArrayList<>(Arrays.asList(usuario));
        for (String usr:
        usuario){
            System.out.println("Las listas   "+usr);
        }



    }

    private void ordenaLista() {

    }
}
