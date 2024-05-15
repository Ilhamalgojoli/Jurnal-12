public class main {
    public static void main(String[] args) {
        Jadwal jadwal = new Jadwal() ;

        jadwal.tambahTugas(new Tugas(5, "Tugas ISD"));
        jadwal.tambahTugas(new Tugas(8,"Rapat UKM"));
        jadwal.tambahTugas(new Tugas(3,"Kuis SBD"));

        System.out.println();
        jadwal.tampilkanTugasPriority();
        System.out.println();
        jadwal.selesaikanTugas();
    }
}
