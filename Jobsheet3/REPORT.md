|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020062|
| Nama | Aura Bintang Aprilian |
| Kelas | TI - 2G |
| Repository | [link] (https://github.com/bebeaura1/PBO/tree/main/Jobsheet3/motorencapsulation) |

# Enkapsulasi Pada Pemrograman Berorientasi Objek

# 3. Percobaan
## 3.1 Percobaan 1 - Enkapsulasi
Untuk hasil running program pada percobaan 1 yaitu seperti pada gambar di bawah ini<br>
<img src="img/percobaan1.png" width="200px"><br>

## 3.2 Percobaan 2 - Access Modifier
Untuk hasil running program pada percobaan 2 yaitu seperti pada gambar di bawah ini<br>
<img src="img/percobaan2.png" width="200ox"><br>

## 3.3 Pertanyaan
1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?
2. Mengapa atribut kecepatan dan kontakOn diset private?
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!

Jawaban pertanyaan
1. Saat menambah kecepatan untuk pertama kalinya akan muncul peringatan "Kecepatan tidak bisa bertambah karena Mesin Off!" karena mesin baru akan menambah kecepatan saat mesin dalam keadaan menyala. Pada method tambah kecepatan di class Motor, disitu tertulis if kontakOn == true, maka kecepatan baru akan ditambah sebanyak 5. Apabila belum, maka akan muncul peringatan seperti yang tadi disebutkan.
2. Atribut kecepatan dan kontakOn diset private karena untuk melindungi data dari perubahan langsung di luar class Motor. Apabila atribut kecepatan dan kontakOn diset public, data didalam objek kecepatan dan status kontak bisa diakses atau diubah secara sembarangan diluar class Motor.
3. Hasil modifikasi percobaan 2 <br>
-Input : <br>
<img src="img/perc2modifkode.png" width="300px"><br><br>
-Output : <br>
<img src="img/perc2modif.png" width="300px"><br><br>
Misal kecepatan += 50; <br>
<img src="img/perc2modifmisal.png" width="300px"><br>

## 3.4 Percobaan 3 - Getter dan Setter
Untuk hasil running program pada percobaan 2 yaitu seperti pada gambar di bawah ini<br>
<img src="img/percobaan3.png" width="400px"><br>

## 6. Tugas
<br>Input : <br>


<br>Output : <br>