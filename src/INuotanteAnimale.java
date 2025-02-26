public class INuotanteAnimale implements IAnimale{

    public INuotanteAnimale() {
        
    }

    public void faNuotare(INuotanteAnimale animale){
        animale.nuotare();
    }

    public void volare(){
       
    }

    public void nuotare(){
        System.out.println("Sto nuotando!!!");
    }

}
