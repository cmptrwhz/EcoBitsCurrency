package org.cmptrwhz.main.tools;

import com.willfp.ecobits.EcoBitsPlugin;
import com.willfp.ecobits.currencies.Currencies;
import com.willfp.ecobits.currencies.Currency;
import com.willfp.ecobits.currencies.CurrencyUtils;
import org.bukkit.OfflinePlayer;
import org.cmptrwhz.main.Main;

import java.math.BigDecimal;

public class EcoBitCurrency {

    OfflinePlayer player;
    String currencyName = null;
    EcoBitsPlugin ecoBitsPlugin;
    Currency currency = null;

    public EcoBitCurrency(OfflinePlayer p) {
        this.player = p;
        ecoBitsPlugin = Main.getInstance().getEcoBitsPlugin();
        currencyName = getEcoBitCurrencyName();
        currency = Currencies.INSTANCE.getByID(currencyName);
    }

    public BigDecimal getCurrentBalance(){
        return CurrencyUtils.getBalance(player,currency);
    }

    public void adjustCurrentBalance(BigDecimal amount){
        CurrencyUtils.adjustBalance(player,currency,amount);
    }

    private String getEcoBitCurrencyName(){
        // Access the main plugin instance
        Main plugin = Main.getInstance();
        // Get a value from the config
        return plugin.getStringConfigValue("ecobitcurrency");
    }
}
