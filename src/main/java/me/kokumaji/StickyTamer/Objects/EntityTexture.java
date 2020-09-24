package me.kokumaji.StickyTamer.Objects;

public enum EntityTexture {
    HORSE("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjc5ZDBjZjA2MTVmZjgxYjFkNWQwYjc5MWFmODU0OTRhYjZiNWFmOTcxZGUxOGE0NmE4ZjkxMWIzYjU5NzM2ZSJ9fX0="),
    BEE("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTg3NDc4N2UzNjE1OWU0ZDc0ZGI1ZTI1YmFiYTk4N2I2NjVkY2M4OTBiZTlmMjYyYmIwY2JjZjVkMDFiODJiNiJ9fX0="),
    CAT("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQwMDk3MjcxYmI2ODBmZTk4MWU4NTllOGJhOTNmZWEyOGI4MTNiMTA0MmJkMjc3ZWEzMzI5YmVjNDkzZWVmMyJ9fX0="),
    CHICKEN("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2YzN2Q1MjRjM2VlZDE3MWNlMTQ5ODg3ZWExZGVlNGVkMzk5OTA0NzI3ZDUyMTg2NTY4OGVjZTNiYWM3NWUifX19"),
    COW("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2RmYTBhYzM3YmFiYTJhYTI5MGU0ZmFlZTQxOWE2MTNjZDYxMTdmYTU2OGU3MDlkOTAzNzQ3NTNjMDMyZGNiMCJ9fX0="),
    FOX("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDg5NTRhNDJlNjllMDg4MWFlNmQyNGQ0MjgxNDU5YzE0NGEwZDVhOTY4YWVkMzVkNmQzZDczYTNjNjVkMjZhIn19fQ=="),
    PIG("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIxNjY4ZWY3Y2I3OWRkOWMyMmNlM2QxZjNmNGNiNmUyNTU5ODkzYjZkZjRhNDY5NTE0ZTY2N2MxNmFhNCJ9fX0="),
    SHEEP("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjMxZjljY2M2YjNlMzJlY2YxM2I4YTExYWMyOWNkMzNkMThjOTVmYzczZGI4YTY2YzVkNjU3Y2NiOGJlNzAifX19"),
    WOLF("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjlkMWQzMTEzZWM0M2FjMjk2MWRkNTlmMjgxNzVmYjQ3MTg4NzNjNmM0NDhkZmNhODcyMjMxN2Q2NyJ9fX0=");

    private String base64;
    
    EntityTexture(String url) {
        this.base64 = url;
    }

    public String GetBase64() {
        return base64;
    }

	public static String fromString(String string) {
		return null;
	}
}