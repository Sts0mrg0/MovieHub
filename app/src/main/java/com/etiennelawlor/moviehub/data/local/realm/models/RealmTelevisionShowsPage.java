package com.etiennelawlor.moviehub.data.local.realm.models;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by etiennelawlor on 5/14/17.
 */

public class RealmTelevisionShowsPage extends RealmObject {

    // region Fields
    private RealmList<RealmTelevisionShow> televisionShows;
    private int pageNumber;
    private boolean isLastPage;
    private Date expiredAt;
    // endregion

    // region Getters

    public RealmList<RealmTelevisionShow> getTelevisionShows() {
        return televisionShows;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public boolean isLastPage() {
        return isLastPage;
    }

    public Date getExpiredAt() {
        return expiredAt;
    }

    // endregion

    // region Setters

    public void setTelevisionShows(RealmList<RealmTelevisionShow> televisionShows) {
        this.televisionShows = televisionShows;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setLastPage(boolean lastPage) {
        isLastPage = lastPage;
    }

    public void setExpiredAt(Date expiredAt) {
        this.expiredAt = expiredAt;
    }

    // endregion

}
