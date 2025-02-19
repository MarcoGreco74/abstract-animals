public class INuotanteAnimale implements IAnimale{

    public INuotanteAnimale() {
        
    }

    public void faiNuotare(INuotanteAnimale animale){
        animale.nuota();
    }

    public void vola(){
       
    }

    public void nuota(){
        System.out.println("Sto nuotando!!!");
    }

}
