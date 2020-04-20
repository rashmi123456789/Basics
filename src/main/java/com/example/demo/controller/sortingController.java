package com.example.demo.controller;

import com.example.demo.logics.sorting.quickSort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sort")
public class sortingController {

    @Autowired
    private quickSort qS;

	@GetMapping("quick-sort")
	public int[] index() {
		return qS.quick();
	}

}