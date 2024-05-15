import java.util.* ;

public class Jadwal {
    PriorityQueue<Tugas> tugas ;

    public Jadwal(){
        tugas = new PriorityQueue<>();
    }
    public boolean isEmpty(){
        return isEmpty() ;
    }
    public void tambahTugas(Tugas tugasBaru){
        this.tugas.add(tugasBaru);
    }
    public String getTugasBaru(){
        if(!tugas.isEmpty()){
            return tugas.peek().deskripsi;
        }
        return null ;
    }
    public void tampilkanTugasPriority(){
        Tugas prioritas = tugas.peek();

        if(prioritas == null){
            System.out.println("Tidak ada tugas yang perlu di selesaikan !!");
        }
        System.out.println("Tugas terdekat yang harus di selesaikan adalah : " + prioritas.deskripsi);
    }
    public void selesaikanTugas(){

        Tugas prioritas = tugas.poll();
        String selanjutNya = getTugasBaru();
        if(prioritas == null){
            System.out.println("Tidak ada tugas yang perlu di selesaikan !!");
        }
        System.out.println(prioritas.deskripsi + " Di selesaikan " + ", tugas selanjut nya di selesaikan" + selanjutNya);
    }
}
