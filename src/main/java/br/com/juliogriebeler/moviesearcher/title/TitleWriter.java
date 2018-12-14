package br.com.juliogriebeler.moviesearcher.title;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.juliogriebeler.moviesearcher.data.model.TitleBasic;

public class TitleWriter implements ItemWriter<TitleBasic> {

		@Autowired
		private FxMarketPricesStore fxMarketPricesStore;

		private static final Logger log = LoggerFactory.getLogger(StockPriceAggregator.class);

		@Override
		public void write(List<? extends TitleBasic> titles) throws Exception {
			titles.forEach(t -> {
				System.out.println(">>> " + t.getOriginalTitle());
//				if (fxMarketPricesStore.containsKey(t.getStock())) {
//					double tradePrice = t.getPrice();
//					StockPriceDetails priceDetails = fxMarketPricesStore.get(t.getStock());
//					// Set highest price
//					if (tradePrice > priceDetails.getHigh()) {
//						priceDetails.setHigh(tradePrice);
//					}
//					// Set lowest price
//					if (tradePrice < priceDetails.getLow()) {
//						priceDetails.setLow(tradePrice);
//					}
//					// Set close price
//					priceDetails.setClose(tradePrice);
//				} else {
//					log.trace("Adding new stock {}", t.getStock());
//					fxMarketPricesStore.put(t.getStock(),
//							new StockPriceDetails(t.getStock(), t.getPrice(), t.getPrice(), t.getPrice(), t.getPrice()));
//				}
			});
		}

	}
