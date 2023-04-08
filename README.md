# TP2DPBO2023
Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Deskripsi Tugas
Buatlah program Java yang terkoneksi dengan database MySQL. Berikut spesifikasi program yang harus dibuat:
* Program bebas, kecuali program Mahasiswa dan Book Author
* Terdapat proses Create, Read, Update, dan Delete data
* Terdapat proses Autentikasi (Login, Register)*
* Menggunakan minimal 2 tabel pada database
* Harus terdapat minimal 1 properti gambar pada class yang dibuat (gambar akan ditampilkan pada UI)
* Terdapat pergantian screen pada UI
* Terdapat button navigasi untuk beralih screen
* List data ditampilkan menggunakan card (JPanel). Contoh card dengan JPanel link\
*Boleh login dan/atau register. Tidak perlu ada enkripsi password

## Desaign Program
Pada program ini terdapat 12 class dengan class `Home` sebagai main class/Main Panel.
* `LoginPage`	: Class ini merupakan class yang didalamnya merupakan run main ketika user menjalankan program, maka akan diarahkan ke halaman login terlebih dahulu.

* `Login`		: Class ini merupakan JFrame yang didalamnya terdapat 2 atribut yaitu name dan db yang mana name itu untuk menandai nama user yang sedang login nantinya dan db untuk intansiasi class dbConnection. Pada class ini juga terdapat beberapa fitur yang mana berupa tombol/button dan href link (kalo di html), tombol - tombol itu merupakan tombol login dan clear(membersihkan field) dan href link ini jika user mengkliknya, maka akan diarahkan ke halaman register.

* `Register`	: Class ini merupakan JFrame yang didalamnya terdapat atribut db. Yang mana pada class ini tentunya merupakan form register/pendaftaran akun ketika user belum mempunyai akun untuk login. Pada class ini juga terdapat beberapa fitur tombol dan href link, yang mana tombol tetsebut yaitu tombol register, clear(membersihkan field) serta tombol back yang jika diklik user akan dikembalikkan ke JForm `Login` dan href link, jika user mengklik href link, maka user akan ditampilkan list - list akun yang sudah terdaftar sebelumnya (note: ketika user register dengan username yang sudah ada dari sebelumnya, maka user akan ditampilkan sebuah error handling yang mana user tidak bisa mendaftarkan akun tersebut).

* `Home`		: Class ini merupakan JFrame yang merupakan Main Panel, berisi JScrollPane yang nantinya akan digunakan untuk menyimpan Card - Card. Terdapat 2 atribut db dan name. Pada Class ini terdapat beberapa fitur yaitu : tombol clear selected yang akan membersihkan panel, kemudian navigasi yang terdiri dari add dan filter data, ketika user memilih salah satu add dari ketiga add (layar, component, laptop; berbentuk dropdownbutton), maka user akan ditampilkan sebuah form add untuk menambahkan sebuah data, kemudian ketika user memilih salah satu filter data dari ketiga data (layar, component, laptop; berbentuk dropdownbutton), maka user akan ditampilkan sebuah/beberapa data yang dipilihnya pada main panel dengan berbentuk card, serta href link terakhir yaitu logout yang mana user melakukan logout dari jar/apk dan mengharuskan login kembali.

* `CardLayar`	: Class ini merupakan JPanel yang berisi tampilan data - data Layar yang terdiri dari ukuran_layar, jenis_layar, jenis_panel, resolusi_layar. Pada class ini terdapat 3 attribut yang terdiri dari db yang sebagai penyambung antara program dengan database dan sekaligus pengeksekusi syntax sql, home merupakan instansiasi, dan id merupakan penanda id dari layar tersebut. Dalam class ini juga terdapat beberapa fitur yaitu update (user akan ditampilkan form AddLayar dengan versi Update) dan delete (menghapus data dari db, note: ketika sebuah data layar sedang digunakan pada class component, maka data layar ini tidak bisa dihapus).

* `CardComponent`	: Class ini merupakan JPanel yang berisi tampilan data - data Component yang terdiri dari cpu, ram, vga, hddssd, idLayar (ukuran_layar, jenis_layar, jenis_panel, resolusi_layar), keyboard, camera. Pada class ini terdapat 4 attribut yaitu : db (sebagai penyambung antara program dengan database dan sekaligus pengeksekusi syntax sql), home merupakan instansiasi, id merupakan penanda id dari Component, dan idLayar merupakan penanda idLayar (FK) yang sedang digunakan oleh class Component ini. Dalam Class ini juga terdapat beberapa fitur yaitu update (user akan ditampilkan form AddComponent dengan versi Update) dan delete (menghapus data dari db, note: ketika sebuah data component sedang digunakan pada class laptop, maka data component ini tidak bisa dihapus).

* `CardLaptop`	: Class ini merupakn JPanel yang berisi tampilan data - data Layar yang terdiri dari merk_laptop, model_laptop, jenis_laptop, id_component(cpu, ram, vga, hddssd, idLayar (ukuran_layar, jenis_layar, jenis_panel, resolusi_layar), keyboard, camera). Pada class ini terdapat 5 atribut yaitu : db (sebagai penyambung antara program dengan database dan sekaligus pengeksekusi syntax sql), home merupakan instansiasi, id merupakan penanda id dari Layar, idComponent merupakan penanda idComponent (FK) yang sedang digunakan oleh class Laptop ini, pathImage yang merupakan sebagai temp lokasi source dari image. Dalam Class ini juga terdapat beberapa fitur yaitu update (user akan ditampilkan form AddLaptop dengan versi Update) dan delete (menghapus data dari db).

* `AddLayar`	: Class ini merupakan JFrame yang berisi field form untuk menginputkan (Versi Input) atau mengubah data (Versi Update) dari table layar di database. Pada class ini terdapat 5 atribut yaitu: home merupakan instansiasi, db (sebagai penyambung antara program dengan database dan sekaligus pengeksekusi syntax sql), isUpdate sebagai penanda apakah user sedang menambahkan sebuah data atau mengedit/mengubah sebuah data, id sebagai penanda ketika user akan mengubah/mengedit sebuah data/id didalam table layar, name sebagai penampungan nameAccount dari table account. Pada class ini juga terdapat beberapa fitur button, yaitu button back untuk menutup form AddLayar, button add untuk menambahkan data kedalam db, button clear untuk membersihkan/mengosongkan field.

* `AddComponent`	: Class ini merupakan JFrame yang berisi field form untuk menginputkan (Versi Input) atau mengubah data (Versi Update) dari table component di database. Pada class ini terdapat 5 attribut yaitu: home merupakan instansiasi, db (sebagai penyambung antara program dengan database dan sekaligus pengeksekusi syntax sql), isUpdate sebagai penanda apakah user sedang menambahkan sebuah data atau mengedit/mengubah sebuah data, id sebagai penanda ketika user akan mengubah/mengedit sebuah data/id didalam table component, tempIdLayar sebagai penanda atau pembanding apakah user mengubah data id layar atau tidak (karena ketika user mengganti data id layar asal dengan yang lainnya, maka data id layar asal status digunakannya akan menjadi false (0) dan data yang baru status digunakannya akan menjadi true (1)). Pada class ini juga terdapat beberapa fitur button, yaitu button back untuk menutup form AddComponent, button add untuk menambahkan data kedalam db, button clear untuk membersihkan/mengosongkan field.

* `AddLaptop`	: Class ini merupakan JFrame yang berisi field form untuk menginputkan (Versi Input) atau mengubah data (Versi Update) dari table laptop di database. Pada class ini terdapat 11 attribut yaitu :
1. Home untuk instansiasi.
2. db (sebagai penyambung antara program dengan database dan sekaligus pengeksekusi syntax sql).
3. isUpdate sebagai penanda apakah user sedang menambahkan sebuah data atau mengedit/mengubah sebuah data.
4. id sebagai penanda ketika user akan mengubah/mengedit sebuah data/id didalam table laptop.
5. name sebagai penampungan nameAccount dari table account.
6. f sebagai temp allocate dari file img yang dipilih.
7. paths sebagai temp absolutepath dari f (nama file img).
8. newFilePath sebagai alokasi data string dengan path yang terbaru (src/ImgUpload/(namafile)).
9. originalPath sebagai temp alokasi data path img awal.
10. newPath sebagai target alokasi data path yang baru didalam local project (src/ImgUpload).
11. tempIdComponent sebagai penanda atau pembanding apakah user mengubah data id component atau tidak (karena ketika user mengganti data id component asal dengan yang lainnya, maka data id component asal, status digunakannya akan menjadi false (0) dan data yang baru, status digunakannya akan menjadi true (1)).

Namafile dari img akan diexplode atau dibuat menjadi unique (contohnya seperti pada php). Pada class ini juga terdapat beberapa fitur button, yaitu button back untuk menutup form AddLaptop, button add untuk menambahkan data kedalam db, button clear untuk membersihkan/mengosongkan field.

* `dbConnection`	: Class ini digunakan sebagai penyambung antara program/apk dengan database. Class ini juga memiliki attribut yaitu statement yang disingkat menjadi stmt dan connection yang disingkat menjadi conn. serta method - method yang terdapat pada class ini akan membantu mengeksekusi query yang akan dilakukan pada JFrame lainnya, karena jika tanpa class ini dan menggunakan executeQuery saja pada JFrame lain, syntax tsb hanya bisa digunakan sekali saja (berdasarkan stackoverflow).

* `ListAccount`	: Class ini merupakan JFrame yang berisi data table yang ditampilkan dari table account, berfungsi untuk user yang ingin mengetahui username/password apa saja yang sudah terdaftar serta terdapat 1 button back untuk menutup frame.

Selain di atas terdapat juga fitur tambahan seperti error handling lainnya.

## Relation of Database
Saya membuat 4 table yaitu account, layar, component dan laptop, yang mana account tidak mempunyai relasi apapun dengan table lainnya, kemudian 3 table sisanya akan saling berkaitan dengan relasi masing masing yaitu one to one (jika diurutkan maka, Laptop memiliki component dan component memiliki layar).

## Desaign GUI
* From Login


* From Register


* Home/Main Panel


* Card Layar


* Card Component


* Card Laptop


* Form Update dan Add Data Layar


* Form Update dan Add Data Component


* Form Update dan Add Data Laptop



## Alur Program
1. User akan ditampilkan menu login dan jika user belum mempunyai akun untuk login, maka user diharuskan mengklik href link `register` untuk beralih Frame ke Frame register (pada field yang terdapat pada Frame ini, user diharuskan mengisi kesemua data).
2. Jika user sudah mempunyai akun untuk login, user dapat login dengan akun yang telah dimilikinya dan user akan dialihkan kedalam Frame Home/Main Panel.
3. Pada Main Panel, user diharuskan memilih dropdown button filter jika ingin menampilkan data tertentu dan add data jika ingin menambahkan data tertentu yang ada pada navbar, serta user dapat melakukan logout yang mana user bisa mengklik href link yang ada pada pojok kanan atas, dan ketika user mengklik href link tsb, user akan dialihkan ke Frame Login kembali dengan diharuskan login kembali.
4. Jika user memilih sebuah data pada dropdownbutton add, maka user akan ditampilkan sebuah form/Frame isian (tergantung data yang dituju, ex : Add Data Layar). (Note: ketika user seusai menambahkan data tertentu, maka user akan ditampilkan sebuah jpanel card tertentu pula yang akan tampil pada main panel).
5. Jika user memilih sebuah data pada dropdownbutton filter, maka user akan ditampilkan sebuah jpanel card tertentu yang akan tampil pada main panel dengan fitur yaitu : user dapat mengedit atau menghapus ditiap card/id/data yang telah diinputkan sebelumnya. Jika user memilih hapus maka akan muncul sebuah JOPTIONPANE/dialog box untuk mengkonfirmasi, sedangkan ketika user memilih update maka akan muncul sebuah form/Frame untuk mengupdate data.
NOTE : Jika user ingin menambahkan data component, sebaiknya tambahkan data layar terlebih dahulu agar ketika pengisian dropdown idlayar tidak kosong dan begitu pula ketika ingin menambahkan data layar, sebaiknya tambahkan data component terlebih dahulu agar ketika pengisian dropdown idcomponent tidak kosong.

* user dapat login menggunakan akun - akun dibawah ini
1. username: ade123	password: 12345

2. username: admin	password: admin


## Dokumentasi
* Register


* Main Panel


* Add Data 
1. Layar

2. Component

3. Laptop


* Update Data 
1. Layar

2. Component

3. Laptop


* Delete Data
1. Layar

2. Component

3. Laptop

