|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020062|
| Nama | Aura Bintang Aprilian |
| Kelas | TI - 2G |
| Repository | [link] (https://github.com/bebeaura1/PBO/tree/main/Jobsheett10) |

# SOLID Principle dan Collections

## - Langkah 1: Proyek dan Kelas Dasar (Customer, Exception, Account)
Untuk hasil running program pada langkah 1 yaitu seperti dibawah ini.<br>
<img src="img/langkah1.png" width="300px"><br>

## - Langkah 2: Subclass dan Interface (SavingsAccount, CheckingAccount)
Untuk hasil running program pada langkah 2 yaitu seperti dibawah ini.<br>
<img src="img/langkah2.png" width="300px"><br>

## - Langkah 3: Bank Berbasis Array dan Program Utama
Untuk hasil running program pada langkah 3 yaitu seperti dibawah ini :<br>
<img src="img/langkah3.png" width="400px"><br>

## - Langkah 4: Bank Beralih dari Array ke Map
Untuk hasil running program pada langkah 4 yaitu seperti dibawah ini :<br>
<img src="img/langkah4.png" width="400px"><br>

## - Langkah 5:  Transaction, Single Responsibility Principle
Untuk hasil running program pada langkah 5 yaitu seperti dibawah ini :<br>
<img src="img/langkah5.png" width="400px"><br>

## - Langkah 6:  AccountRepository, Dependency Inversion Principle
Untuk hasil running program pada langkah 6 yaitu seperti dibawah ini :<br>
<img src="img/langkah6.png" width="400px"><br>

## - Langkah 7: Menelusuri OCP, LSP, dan ISP pada Kode yang Sudah Dibangun
Untuk hasil running program pada langkah 7 yaitu seperti dibawah ini :<br>
    - 7a. Open/Closed<br>
    <img src="img/langkah7a_bank.png" width="400px"><br>
    <img src="img/langkah7a_account.png" width="400px"><br>
    - 7b. Liskov Substitution<br>
    <img src="img/langkah7b.png" width="400px"><br>
    - 7c. Interface Segregation<br>
    <img src="img/langkah7c.jpg" width="500px"><br>
    
## Tugas Mandiri
1. 
    - Input :<br>
        - Class BusinessAccount<br>
        <img src="img/tugas/BusinessAccount.png" width="500px"><br>
        - Class Main<br>
        <img src="img/tugas/main.png" width="500px"><br>
    - Output :<br>
    <img src="img/tugas/hasil.png" width="500px"><br><br>

2. - **(a)** Prinsip yang dibuktikan adalah Open/Closed Principle (OCP). Prinsip ini menyatakan bahwa sebuah entitas perangkat lunak harus terbuka untuk ekstensi (bisa ditambah fitur baru), tetapi tertutup untuk modifikasi (kode lama tidak boleh diubah). Fakta bahwa Account dan Bank tidak perlu diubah sama sekali saat kita menambahkan BusinessAccount membuktikan bahwa sistem sudah didesain dengan baik. Kita bisa memperluas fungsionalitas sistem hanya dengan membuat class turunan baru, tanpa harus mengotak-atik kode inti yang sudah berjalan.<br>
    - **(b)** Hal ini membuktikan penerapan ISP dan LSP. Method processMonthEnd() tidak perlu tau apakah sebuah objek itu SavingsAccount atau BusinessAccount. Bank hanya bertanya pada objek tersebut "apakah kamu memiliki kemampuan InterestBearing?". Karena BusinessAccount tidak mengimplements interface InterestBearing, maka secara otomatis Bank akan melewatinya (tidak memberikan bunga). Bank tidak perlu mengetahui detail class BusinessAccount karena Bank sepenuhnya bergantung pada interface bukan pada class konkret.<br>
    - **(c)** Prinsip yang membuat ini mungkin adalah DIP. Prinsip ini menyatakan bahwa modul tingkat tinggi (Bank) tidak boleh bergantung pada modul tingkat rendah ( InMemoryAccountRepository), melainkan harus bergantung pada interface AccountRepository. Bank tidak peduli datanya disimpan di memori, atau dimanapun. Selama class baru tersebut mengimplements interface AccountRepository, Bank bisa langsung menggunakannya tanpa perlu diubah kodenya sama sekali.