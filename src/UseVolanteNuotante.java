public class UseVolanteNuotante {

    static void faiVolare(IVolatile animale){
        animale.vola();
    }

    static void faiNuotare(INuotante animale){
        animale.nuota();
    }

    public static void main(String[] args) {
        //IVolatile rondine = new IVolatile();
        Delfino delfino = new Delfino();
        UseVolanteNuotante.faiNuotare(delfino);
        Aquila aquila = new Aquila();
        UseVolanteNuotante.faiVolare(aquila);
    }
}