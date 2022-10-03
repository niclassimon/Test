package com.example.my_urlaub;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import java.util.UUID;

@Entity(tableName = "urlaub_table")
public class Urlaub {

    @PrimaryKey

    @NonNull
    public final UUID id;
    @ColumnInfo(name = "location")
    public String location;
    @ColumnInfo(name = "dateStart")
    public String dateStart;
    @ColumnInfo(name = "dateEnd")
    public String dateEnd;
    @ColumnInfo(name = "description")
    public String description;
    @ColumnInfo(name = "imgSource")
    public String imgSource;

    @Ignore
    public Urlaub(String location, String dateStart, String dateEnd, String description, String imgSource){
        this.id = UUID.randomUUID();
        if (location != null){
            this.location = location;}
        else {this.location = "";}
        if (dateStart != null){
            this.dateStart = dateStart;}
        else {this.dateStart = "";}
        if (dateEnd != null){
            this.dateEnd = dateEnd;}
        else {this.dateEnd = "";}
        if (description != null){
            this.description = description;}
        else {this.description = "";}
        if (imgSource != null){
            this.imgSource = imgSource;}
        else {this.imgSource = "";}
    }

    public Urlaub(@NonNull UUID id, String location, String dateStart, String dateEnd, String description, String imgSource){
        this.id = id;
        if (location != null){
            this.location = location;}
        else {this.location = "";}
        if (dateStart != null){
            this.dateStart = dateStart;}
        else {this.dateStart = "";}
        if (dateEnd != null){
            this.dateEnd = dateEnd;}
        else {this.dateEnd = "";}
        if (description != null){
            this.description = description;}
        else {this.description = "";}
        if (imgSource != null){
            this.imgSource = imgSource;}
        else {this.imgSource = "";}
    }


    public String getLocation() {
        return location;
    }


    public String getStartDate() {
        return dateStart;
    }

    public String getEndDate() {
        return dateEnd;
    }

    public String getDescription() {
        return description;
    }

    public String getImgSource() {
        return imgSource;
    }
}
