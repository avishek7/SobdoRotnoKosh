package com.satsang.naihati.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satsang.naihati.model.Word;
import com.satsang.naihati.repository.WordRepository;
@Service
public class WordService {

	@Autowired
	private WordRepository wordRepository;
	public List<Word> getWords(Map<String, String> queryMap) {
		//if(!queryMap.isEmpty()) {
			List<Word> wordList = wordRepository.findAll();
			//System.out.println("===============================");
			System.out.println(wordList);
			return wordList;
		/*}else
			return null;*/
	}

}
