package eternal.hoge.example.service;

import eternal.hoge.example.model.Hoge;

import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class HogeService {

	private final Map<String, Hoge> hoges = new TreeMap<String, Hoge>();

	private Random ran = new Random();

	public HogeService() {
		hoges.put("123", new Hoge(123, "first hoge"));
		hoges.put("456", new Hoge(456, "second hoge"));
		hoges.put("789", new Hoge(789, "third hoge"));
	}

	public Collection<Hoge> findAllHoge() {
		return hoges.values();
	}
	
	public Hoge findHoge(String id) {
		if ("789".equals(id)) {

			int delay = 500 + ran.nextInt(1500);
			try {
				Thread.sleep(delay);
			} catch (Exception e) {
				// ignore
			}
		}
		return hoges.get(id);
	}

	// for HTTP POST
	public void createHoge(Hoge hoge) {
		hoges.put(String.valueOf(hoge.getId()), new Hoge(hoge.getId(), hoge.getName()));
	}
	
	// for HTTP PUT
	public void updateHoge(Hoge hoge) {
		hoges.put(String.valueOf(hoge.getId()), new Hoge(hoge.getId(), hoge.getName()));
	}
	
	// for HTTP DELETE
	public void deleteHoge(Hoge hoge) {
		hoges.remove(String.valueOf(hoge.getId()));
	}
}
