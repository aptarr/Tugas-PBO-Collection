import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aptar
 */

class Hewan{
    private String name;
    
    Hewan(String nama){
        this.name = nama;
    }
    
    public String getNama(){
        return this.name;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<String> namaSiswa = new ArrayList();
        
        namaSiswa.add("Adam");
        namaSiswa.add("Abi");
        namaSiswa.add("Ardi");
        
        for(String siswa: namaSiswa){
            System.out.println(siswa);
        }
        System.out.println();
        namaSiswa.remove("Abi");
        for(String siswa: namaSiswa){
            System.out.println(siswa);
        }
        System.out.println();
        namaSiswa.add(1, "Bagas");
        for(String siswa: namaSiswa){
            System.out.println(siswa);
        }
        HashSet<Hewan> macamHewan = new HashSet<>();
        Hewan h1 = new Hewan("Harimau");
        Hewan h2 = new Hewan("Gajah");
        Hewan h3 = new Hewan("Singa");
        
        macamHewan.add(h1);
        macamHewan.add(h2);
        macamHewan.add(h3);
        
        System.out.println();
        
        if(macamHewan.contains(h1)){
            System.out.println(h1.getNama());
        }
        
        if(!macamHewan.isEmpty()){
            System.out.println("ada isinya");
        }
        
        HashMap<String, String> mangkokBuah = new HashMap<String, String>();
        mangkokBuah.put("Apel", "Merah");
        mangkokBuah.put("Anggur", "Ungu");
        mangkokBuah.put("Pisang", "Kuning");
        
        System.out.println();
        
        System.out.println("Warna buah Apel : " + mangkokBuah.get("Apel"));
        FindBuah(mangkokBuah, "Pisang");
        
        System.out.println();
        
        LinkedList<String> KumpulanAngka1 = new LinkedList<>();
        
        KumpulanAngka1.add("1");
        KumpulanAngka1.add("4");
        KumpulanAngka1.add("3");
        KumpulanAngka1.add("2");
        
        while(!KumpulanAngka1.isEmpty()){
            System.out.println(KumpulanAngka1.removeFirst());
        }
        
        System.out.println();
        LinkedList<String> KumpulanAngka2 = new LinkedList<>();
        
        KumpulanAngka2.push("1");
        KumpulanAngka2.push("4");
        KumpulanAngka2.push("3");
        KumpulanAngka2.push("2");
        
        while(!KumpulanAngka2.isEmpty()){
            System.out.println(KumpulanAngka2.pop());
        }
        System.out.println();
        if(h1.getNama().compareTo(h2.getNama()) == 0){
            System.out.println("Sama");
        }else{
            System.out.println("Tidak sama");
        }     
    }
    
    static void FindBuah(HashMap<String, String> mangkokBuah, String Buah){
        if(mangkokBuah.containsKey(Buah)){
            System.out.println("Warna Buah : " + mangkokBuah.get(Buah));
        }
    }
}
