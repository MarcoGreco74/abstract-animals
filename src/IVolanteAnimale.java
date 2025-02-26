public class IVolanteAnimale implements IAnimale{

    public IVolanteAnimale() {
        
    }

    public void faVolare(IVolanteAnimale animale){
        animale.volare();
    }

    public void volare(){
        System.out.println("Sto volando!!!");
    }

    public void nuotare(){

    }
    
}
