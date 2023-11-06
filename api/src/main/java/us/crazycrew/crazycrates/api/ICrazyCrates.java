package us.crazycrew.crazycrates.api;

import org.jetbrains.annotations.NotNull;
import us.crazycrew.crazycrates.api.users.UserManager;

import java.io.File;

public interface ICrazyCrates {

    void enable();

    void disable();

    File getDataFolder();

    @NotNull UserManager getUserManager();

}