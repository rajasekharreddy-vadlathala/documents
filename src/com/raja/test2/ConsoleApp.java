package com.raja.test2;

public class ConsoleApp {

	/**
	 * FILL IN THIS CODE
	 * (you're allowed to create new interfaces, classes etc. as much as you want!)
	 * such that given an Address, it should be possible to return the formatted address lines
	 * depending on the country address format.
	 * 
	 * For example:
	 * <li>US Address Format
	 * <pre>
	 *   street
	 *   state, pobox
	 *   US
	 * </pre>
	 * <li>German Address Format
	 * <pre>
	 *   street, pobox
	 *   state, DE
	 * </pre>
	 * 
	 * NOTE that it should be as easy as possible to add any number of new address lines format
	 * e.g. for Malaysia, Thailand etc. in the near future
	 * @param address the address
	 * @return formatted address lines
	 */
	public static String[] formatAddress(Address address) {
		// TODO: code!
		try{
			StringBuilder s = new StringBuilder();
			if("US".equals(address.getCountryCode())){

				s.append(address.getCountryCode()+" Address Format"+"\n");
				s.append(address.getStreet()+"\n");
				s.append(address.getState()+","+address.getPoBox()+"\n");
				s.append(address.getCountryCode());

			}if("DE".equals(address.getCountryCode())){

				s.append(address.getCountryCode()+" Address Format"+"\n");
				s.append(address.getStreet()+","+address.getPoBox()+"\n");
				s.append(address.getState()+","+address.getCountryCode()+"\n");
				s.append(address.getCountryCode());
			}
			System.out.println(s.toString());
			return s.toString().split("");
		}catch(Exception e){
			throw new UnsupportedOperationException();
		}
	}

	public static void main(String[] args) {
		Address usaAddress = new Address();
		usaAddress.setCountryCode("US");
		usaAddress.setStreet("US.street");
		usaAddress.setState("US.state");
		usaAddress.setPoBox("US.PoBox");

		System.out.println("US Address");
		System.out.println("----------");
		formatAddress(usaAddress);
		for (String addressLine : formatAddress(usaAddress)) {
			System.out.println(addressLine);
		}

		Address germanAddress = new Address();
		germanAddress.setCountryCode("DE");
		germanAddress.setStreet("DE.street");
		germanAddress.setState("DE.state");
		germanAddress.setPoBox("DE.PoBox");

		System.out.println("DE Address");
		System.out.println("----------");
		for (String addressLine : formatAddress(germanAddress)) {
			System.out.println(addressLine);
		}
	}
}
