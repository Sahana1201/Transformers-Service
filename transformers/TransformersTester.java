package com.xworkz.transformers;

import com.xworkz.transformers.dto.TransformersDTO;
import com.xworkz.transformers.service.TransformersService;
import com.xworkz.transformers.service.TransformersServiceImpl;

public class TransformersTester {

	public static void main(String[] args) {
		TransformersDTO dto = new TransformersDTO("sahana", "Tumkur", "Moody", "Love to travel ",
				"If some one irritates more", "Someone not talking to me without any reason", "cooking");
		TransformersService service = new TransformersServiceImpl();
		String save = service.validateAndSave(dto);
		System.out.println(save);

		System.out.println("#####################################################");

		TransformersDTO dto1 = new TransformersDTO("Teju", "Dharwad", "Silent", "Eating", "Talking", "DontKnow",
				"Traveling");
		String save1 = service.validateAndSave(dto1);
		System.out.println(save1);

	}

}
