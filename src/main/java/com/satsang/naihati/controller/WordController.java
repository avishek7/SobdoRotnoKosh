package com.satsang.naihati.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.satsang.naihati.model.Word;
import com.satsang.naihati.service.WordService;

@RestController
public class WordController {

	@Autowired
	private WordService wordService;
	
	@RequestMapping(value="/words", method = RequestMethod.GET)
	public List<Word> getWords(@RequestParam Map<String, String> queryMap) {
		return wordService.getWords(queryMap);
	}
	@RequestMapping(value="/words/{wordKey}", method = RequestMethod.GET)
	public Word getWord(@PathVariable ("wordkey") String wordkey) {
		return null;
	}
	@RequestMapping(value="/words", method = RequestMethod.POST)
	public void insertWord(@RequestBody Word word) {
		
	}
	@RequestMapping(value="/multiwords", method = RequestMethod.POST)
	public void insertmultipleWords(@RequestBody List<Word> words) {
		
	}
	@RequestMapping(value="/words/{wordKey}", method = RequestMethod.PATCH)
	public void updateWord(@PathVariable ("wordkey") String wordkey,@RequestBody Word word) {
		
	}
}
