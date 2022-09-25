package com.spring.spring_data_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.spring_data_jpa.entity.ChuyenBay;
import com.spring.spring_data_jpa.entity.MayBay;
import com.spring.spring_data_jpa.responsitory.ChuyenBayRepository;
import com.spring.spring_data_jpa.services.ChuyenBayService;
import com.spring.spring_data_jpa.services.MayBayService;

@RestController
@RequestMapping("/")
public class MainController {

//    @Autowired
//    private MayBayService mayBayService;
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
//	private ChuyenBayService chuyenBayService;

    @ResponseBody
    @GetMapping("/")
    public String home() {
        String html = "";
        html += "<ul>";
        html += " <li><a href='/showAll'>Show All Chuyến bay</a></li>";
        html += " <li><a href='/1'>1.	Cho biết các chuyến bay đi Đà Lạt (DAD).</a></li>";
        html += " <li><a href='/2'>2.	Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.</a></li>";
        html += " <li><a href='/3'>3.	Tìm các nhân viên có lương nhỏ hơn 10,000.</a></li>";
        html += " <li><a href='/4'>4.	Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.</a></li>";
        html += " <li><a href='/5'>5.	Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).</a></li>";
        html += " <li><a href='/6'>6.	Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).</a></li>";
        html += " <li><a href='/7'>7.	Có bao nhiêu loại máy báy Boeing.</a></li>";
        html += " <li><a href='/8'>8.	Cho biết tổng số lương phải trả cho các nhân viên.</a></li>";
        html += " <li><a href='/9'>9.	Cho biết mã số của các phi công lái máy báy Boeing.</a></li>";
        html += " <li><a href='/10'>10.	Cho biết các nhân viên có thể lái máy bay có mã số 747.</a></li>";
        html += "</ul>";
        return html;
    }


    @GetMapping("/showAll")
    public List<ChuyenBay> showAllEmployee() {

//        Iterable<MayBay> maybay = maybayRepository.findAll();
        String html = "asfasf";
//        for (MayBay mb : maybay) {
//            html += mb + "<br>";
//        }

//        return chuyenBayService.findAll();
    	return chuyenBayRepository.findAll();
    }
    
    @ResponseBody
    @RequestMapping("/1")
    public List<ChuyenBay> showFullNameLikeTom() {
        return chuyenBayRepository.findByGaden("DAD");
    }
}
