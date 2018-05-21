package com.satsang.naihati.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.satsang.naihati.model.Word;
import com.satsang.naihati.service.WordService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WordControllerTest {
	
	@Mock
	WordService wordServiceMock;
	@InjectMocks
	private WordController wordController;
	@Test
	public void getWords() {
		List<Word> wordList = new ArrayList<>();
		when(wordServiceMock.getWords(null)).thenReturn(wordList);
		assert(wordController.getWords(null).equals(wordList));
	}
}
