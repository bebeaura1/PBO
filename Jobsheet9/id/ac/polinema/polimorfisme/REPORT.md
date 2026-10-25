|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020062|
| Nama | Aura Bintang Aprilian |
| Kelas | TI - 2G |
| Repository | [link] (https://github.com/bebeaura1/PBO/tree/main/Jobsheet9) |

# Polimorfisme

## - Percobaan 1: Bentuk Dasar Polimorfisme
Untuk hasil running program pada percobaan 1 pada beberapa langkah yaitu seperti dibawah ini.<br>
- Langkah 3 :<br>
<img src="img/percobaan1/langkah3.png" width="300px"><br>
- Langkah 4 (error) :<br>
<img src="img/percobaan1/langkah4.png" width="500px"><br>
    ```
        +------------------------------------------------------------------------------------+
        | Perubahan                         | Pesan error                                    |
        |-----------------------------------|------------------------------------------------|
        | Aktifkan baris Vegetarian v2 = l; | Type mismatch: cannot convert from             |
        |                                   | GambaranDasar.Lion to GambaranDasar.Vegetarian |
        +------------------------------------------------------------------------------------+
    ```
- Langkah 9 :<br>
<img src="img/percobaan1/langkah9.png" width="300px"><br>

**Jawaban Pertanyaan Percobaan 1** <br>
1. Class InternshipEmployee dan PermanentEmployee<br>
2. Class PermanentEmployee dan ElectricityBill<br>
3. Karena e memiliki tipe referensi Employee, sedangkan PermanentEmployee dan InternshipEmployee merupakan subclass dari Employee<br>
4. Karena p memiliki tipe referensi interface Payable, sedangkan class PermanentEmployee dan ElectricityBill keduanya meng-implements interface Payable<br>
5. - p = iEmp; error karena InternshipEmployee tidak meng-implements interface Payable
    - e = eBill; error karena ElectricityBill bukan turunan dari class Employee<br>
Error ini sama persis dengan Vegetarian v2 = l; pada GambaranDasar, di mana Lion tidak meng-implements Vegetarian. Tipe data referensi tidak cocok dengan hierarki kelas dari objek yang ditunjuk<br>
6. - Tipe Referensi: Tipe data variabel saat deklarasi/kompilasi (Animal), yang menentukan method atau field apa saja yang boleh dipanggil oleh programmer.
    - Tipe Objek: Tipe data asli dari objek yang dibuat di memori heap saat runtime dengan new (Deer), yang menentukan versi eksekusi aktual dari method tersebut<br>
7. Polimorfisme memungkinkan sebuah variabel referensi bertipe superclass atau interface untuk menunjuk objek dari subclass atau class implementor-nya. Hal ini memungkinkan satu variabel memiliki banyak bentuk perilaku sesuai objek aslinya.<br><br>

## - Percobaan 2: Virtual Method Invocation
Untuk hasil running program pada percobaan 2 pada beberapa langkah yaitu seperti dibawah ini.<br>
- Langkah 2 :<br>
<img src="img/percobaan2/langkah2.png" width="500px"><br>
- Langkah 3 :<br>
<img src="img/percobaan2/langkah3.png" width="500px"><br>
- Langkah 4 :<br>
<img src="img/percobaan2/langkah4.png" width="500px"><br>
    ```
        +-----------------------------------------------------------------------+
        | Perubahan                     | Pesan error                           |
        |-------------------------------|---------------------------------------|
        | Panggil e.getSalary() pada e  | The method getSalary() is undefined   |
        | bertipe Employee              | for the type Employee                 |
        +-----------------------------------------------------------------------+
    ```

**Jawaban Pertanyaan Percobaan 1** <br>
1. Karena variabel e dan pEmp menunjuk ke objek yang sama di memori, yaitu objek PermanentEmployee (Dedik)<br>
2. Disebut pemanggilan method virtual pada e karena compiler mengenali method berdasarkan tipe referensi Employee, tetapi saat dijalankan, java secara dinamis memanggil versi overriding milik PermanentEmployee. Sedangkan pEmp sudah secara langsung bertipe PermanentEmployee dari awal sehingga tidak memerlukan resolusi tipe secara dinamis<br>
3. Virtual Method Invocation adalah mekanisme pemanggilan method hasil overriding melalui variabel referensi polimorfik. Disebut virtual karena method yang terlihat oleh compiler (berdasarkan tipe referensi) berbeda dengan versi method yang seandainya/sebenarnya dieksekusi oleh JVM saat program berjalan (berdasarkan tipe objek)<br>
4. Karena isi objek dari variabel e telah diubah dari PermanentEmployee menjadi InternshipEmployee. Versi method getEmployeeInfo() yang dijalankan selalu menyesuaikan tipe objek yang sedang ditunjuk oleh e<br>
5. Karena compiler melakukan pemeriksaan kelayakan syntax berdasarkan tipe referensi (Employee), bukan tipe objek. Class Employee tidak memiliki method getSalary(), sehingga compiler menganggap method tersebut tidak ada / cannot find symbol.<br><br>

## - Percobaan 3: Heterogeneous Collection
Untuk hasil running program pada percobaan 3 pada beberapa langkah yaitu seperti dibawah ini :<br>
- Langkah 2 :<br>
<img src="img/percobaan3/langkah2.png" width="500px"><br>
- Langkah 3 :<br>
<img src="img/percobaan3/langkah3.png" width="500px"><br>
    ```
        +-----------------------------------------------------------------------+
        | Perubahan                     | Pesan error                           |
        |-------------------------------|---------------------------------------|
        | Aktifkan baris Employee[] e2  | Type mismatch: cannot convert from    |
        | = {pEmp, iEmp, eBill};        | ElectricityBill to Employee           |
        +-----------------------------------------------------------------------+
    ```