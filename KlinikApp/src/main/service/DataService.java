package service;

import util.AppException;

public abstract class DataService {

    public abstract void simpan() throws AppException;

    public abstract void tampilkan();
}