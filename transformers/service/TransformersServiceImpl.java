package com.xworkz.transformers.service;

import com.xworkz.transformers.dto.TransformersDTO;

public class TransformersServiceImpl implements TransformersService {

	@Override
	public String validateAndSave(TransformersDTO dto) {

		boolean nameValid = false;
		boolean placeValid = false;
		boolean angryValidate = false;
		boolean happyValidate = false;
		boolean sadValidate = false;

		if (dto != null) {
			System.out.println("DTO is not null , will start validation");

			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 50) {
				System.out.println("Name is valid");
				nameValid = true;
			} else {
				System.out.println("Name is notvalid");
				nameValid = false;
			}

			String place = dto.getPlace();
			if (place != null && !place.isEmpty() && place.length() >= 4 && place.length() <= 20) {
				System.out.println("Place is valid");
				placeValid = true;
			} else {
				System.out.println("Place is Notvalid");
				placeValid = false;
			}

			String angry = dto.getAngry();
			if (angry != null && !angry.isEmpty() && angry.length() >= 4 && angry.length() <= 12) {
				System.out.println("Angry is valid");
				angryValidate = true;
			} else {
				System.out.println("Angry is not valid");
				angryValidate = false;
			}

			String happy = dto.getHappy();
			if (happy != null && !happy.isEmpty() && happy.length() >= 4 && happy.length() <= 12) {
				System.out.println("Happy is valid");
				happyValidate = true;
			} else {
				System.out.println("Happy is not valid");
				happyValidate = false;
			}

			String sad = dto.getSad();
			if (sad != null && !sad.isEmpty() && sad.length() >= 4 && sad.length() <= 12) {
				System.out.println("Sad is valid");
				sadValidate = true;
			} else {
				System.out.println("Sad is not valid");
				sadValidate = false;
			}
			if (nameValid && placeValid && angryValidate && happyValidate && sadValidate) {
				System.out.println("data is valid ");
				return "SUCCESS";
			}

			return "FAILURE";

		}
		return "FAILURE";
	}
}