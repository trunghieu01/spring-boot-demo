package com.spring.spring_data_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.spring_data_jpa.entity.ChuyenBay;
import com.spring.spring_data_jpa.entity.MayBay;
import com.spring.spring_data_jpa.entity.NhanVien;
import com.spring.spring_data_jpa.responsitory.ChuyenBayRepository;
import com.spring.spring_data_jpa.responsitory.MayBayRepository;
import com.spring.spring_data_jpa.responsitory.NhanVienRepository;
import com.spring.spring_data_jpa.services.ChuyenBayService;
import com.spring.spring_data_jpa.services.MayBayService;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private MayBayRepository mayBayRepository;
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	@Autowired
    private NhanVienRepository nhanVienRepository;

    @ResponseBody
    @GetMapping("/")
    public String home() {
        String html = "";
        html += "<ul>";
        html += " <li><a href='/showAll'>Show All Chuyến bay</a></li>";
        html += " <li><a href='/1'>1. Cho biết các chuyến bay đi Đà Lạt (DAD).</a></li>";
        html += " <li><a href='/2'>2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.</a></li>";
        html += " <li><a href='/3'>3. Tìm các nhân viên có lương nhỏ hơn 10,000.</a></li>";
        html += " <li><a href='/4'>4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.</a></li>";
        html += " <li><a href='/5'>5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).</a></li>";
        html += " <li><a href='/6'>6. Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).</a></li>";
        html += " <li><a href='/7'>7. Có bao nhiêu loại máy báy Boeing.</a></li>";
        html += " <li><a href='/8'>8. Cho biết tổng số lương phải trả cho các nhân viên.</a></li>";
        html += " <li><a href='/9'>9. Cho biết mã số của các phi công lái máy báy Boeing.</a></li>";
        html += " <li><a href='/10'>10. Cho biết các nhân viên có thể lái máy bay có mã số 747.</a></li>";
        html += "</ul>";
        return html;
    }


    @GetMapping("/showAll")
    public List<ChuyenBay> showAll() {
    	return chuyenBayRepository.findAll();
    }
    
    @ResponseBody
    @RequestMapping("/1")
    public List<ChuyenBay> showGaDen() {
        return chuyenBayRepository.findByGaden("DAD");
    }
    
    @ResponseBody
    @RequestMapping("/2")
    public List<MayBay> showTamBay() {
        return mayBayRepository.findByTambay(10000);
    }
    
    @ResponseBody
    @RequestMapping("/3")
    public List<NhanVien> showLuong() {
        return nhanVienRepository.findByLuong(10000);
    }
    
    @ResponseBody
    @RequestMapping("/4")
    public List<ChuyenBay> showDuongBay() {
        return chuyenBayRepository.findByDuongbay(8000, 10000);
    }
    
    @ResponseBody
    @RequestMapping("/5")
    public List<ChuyenBay> showChuyenBaySG_BMT() {
        return chuyenBayRepository.findBySG_BMT("SGN", "BMV");
    }
    
    @ResponseBody
    @RequestMapping("/6")
    public String countChuyenBay() {
        return "Số chuyến bay xuất phát từ Sài Gòn (SGN): " +chuyenBayRepository.countChuyenBay("SGN");
    }
    
    @ResponseBody
    @RequestMapping("/7")
    public String countMayBay() {
        return "Số loại máy báy Boeing: " +mayBayRepository.countLoaiMB("Boeing");
    }
    
    @ResponseBody
    @RequestMapping("/8")
    public String sumLuong() {
        return "Tổng số lương phải trả cho các nhân viên: " +nhanVienRepository.sumLuong();
    }
    
//    @ResponseBody
//    @RequestMapping("/9")
//    public List<MayBay> findPhiCong() {
//        return mayBayRepository.findPhiCong("Boeing");
//    }
    
//    @ResponseBody
//    @RequestMapping("/10")
//    public List<MayBay> findPhiCong() {
//        return mayBayRepository.findPhiCong("Boeing");
//    }
}
