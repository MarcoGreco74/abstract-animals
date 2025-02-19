/*
Esercizio 2 : interfacce -  Alcuni degli animali che abbiamo creato volano, altri nuotano.
Gli animali che volano hanno il seguente metodo :
void vola() (mostra a video “Sto volando!!!”)
Gli animali che nuotano hanno il seguente metodo :
void nuota() (mostra a video “Sto nuotando!!!”)
Scrivere un programma avente 2 metodi :
void faiVolare(IVolante animale)
void faiNuotare(INuotante animale)
Questi metodi prendono come parametro un animale che può o volare / nuotare e richiamano il corrispondente metodo vola() / nuota().
Scrivere un programma che istanzi animali che volano o nuotano e richiamare i metodi faiVolare / faiNuotare passandoglieli come parametro.
*/
public class App2 {
    
    public static void main(String[] args) {
        IVolanteAnimale falco = new IVolanteAnimale();
        //IAnimale delfino = new INuotanteAnimale();
        INuotanteAnimale delfino = new INuotanteAnimale();
        falco.faiVolare(falco);
        delfino.faiNuotare(delfino);
        
    }

}
