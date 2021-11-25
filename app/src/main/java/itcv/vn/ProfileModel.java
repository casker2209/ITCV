package itcv.vn;

import java.util.ArrayList;
import java.util.List;

public class ProfileModel {
    private String name;
    private String position;
    private String date;
    private String email;
    private String address;
    private String phone;

    private List<GeneralInformation> skills;
    private List<GeneralInformation> achievements;
    private List<GeneralInformation> hobbies;

    private String description;
    private List<SpecializedInformation> education;
    private List<SpecializedInformation> experiences;
    private List<SpecializedInformation> activities;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ProfileModel(String name, String position, String date, String email, String address, String phone, List<GeneralInformation> skills, List<GeneralInformation> achievements, List<GeneralInformation> hobbies, String description, List<SpecializedInformation> education, List<SpecializedInformation> experiences, List<SpecializedInformation> activities) {
        this.name = name;
        this.position = position;
        this.date = date;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.skills = skills;
        this.achievements = achievements;
        this.hobbies = hobbies;
        this.description = description;
        this.education = education;
        this.experiences = experiences;
        this.activities = activities;
    }

    public ProfileModel(String name, String position, String date, String email, String address, String phone){
        this.position = position;
        this.date = date;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.achievements = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.hobbies = new ArrayList<>();
        this.education = new ArrayList<>();
        this.experiences = new ArrayList<>();
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<GeneralInformation> getSkills() {
        return skills;
    }

    public void setSkills(List<GeneralInformation> skills) {
        this.skills = skills;
    }

    public List<GeneralInformation> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<GeneralInformation> achievements) {
        this.achievements = achievements;
    }

    public List<GeneralInformation> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<GeneralInformation> hobbies) {
        this.hobbies = hobbies;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SpecializedInformation> getEducation() {
        return education;
    }

    public void setEducation(List<SpecializedInformation> education) {
        this.education = education;
    }

    public List<SpecializedInformation> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<SpecializedInformation> experiences) {
        this.experiences = experiences;
    }

    public List<SpecializedInformation> getActivities() {
        return activities;
    }

    public void setActivities(List<SpecializedInformation> activities) {
        this.activities = activities;
    }
}
