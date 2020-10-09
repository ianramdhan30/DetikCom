package com.example.detikcom.Adapter

import com.example.detikcom.R

data class berita(var title: String, var desc: String, var photo: Int)

object NewsModel{
    val newList = listOf<berita>(
        berita("Tolak Omnibus Law, Buruh Geruduk Kantor Wali Kota Bekasi","CNN Indonesia | Kamis, 08/10/2020 10:17 WIB", R.drawable.img_news1),
        berita("Kondisi Terkini Halte TransJakarta Bundaran HI Usai Dibakar Pendemo","detikNews | Jumat, 09 Okt 2020", R.drawable.img_news2),
        berita("Jokowi Persilakan Penolak UU Cipta Kerja Gugat ke MK","Kompas.com | 09/10/2020, 17:54 WIB",R.drawable.img_news3),
        berita("Omnibus Law Jamin Pacu Ekonomi RI? Dahlan Iskan: Belum Tentu","detikcom | 2 Jam yang lalu",R.drawable.img_news4),
        berita("Serapan Anggaran PEN Meningkat di 4 Sektor Prioritas, Ini Rinciannya","detikcom | 08 Okt 2020 16:10 WIB",R.drawable.img_news5),
        berita("4 Tersangka Demo Rusuh di Semarang Ternyata Masih Maba","detikcom | Jumat, 09 Okt 2020",R.drawable.img_news6),
        berita("Layar OPPO Reno4 F Siap Manjakan Mata dengan Super AMOLED","detikcom | 09 Okt 2020 07:05 WIB",R.drawable.img_news7),
        berita("Nih Wujud Toyota Innova Facelift Model 2021","detikOto | 4 Jam Yang Lalu",R.drawable.img_news8),
        berita("Tak Ada Pelajaran Sejarah Kolonialisme di Sekolah Jerman, Mengapa?","detikcom | 25 Menit yang lalu",R.drawable.img_news9)
    )
}