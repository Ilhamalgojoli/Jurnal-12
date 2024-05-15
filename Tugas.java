public class Tugas implements Comparable<Tugas>{
    private int priority ;
    String deskripsi ;

    public Tugas(int priority,String deskripsi){
        this.priority = priority ;
        this.deskripsi = deskripsi ;
    }
    @Override
    public int compareTo(Tugas o){
        return Integer.compare(this.priority,o.priority);
    }

}
