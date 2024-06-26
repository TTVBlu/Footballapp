package com.JRobertFinal.footballapp.data.match

import com.JRobertFinal.footballapp.data.league.remote.response.DetailLeague
import com.JRobertFinal.footballapp.data.match.remote.response.Match
import com.JRobertFinal.footballapp.data.team.remote.response.Team
import io.reactivex.Observable

interface MatchDataSource {
    fun getMatchList(id : String): Observable<List<Match>>
    fun getDetailMatch(id : String): Observable<List<Match>>
    fun getDetailLeague(id : String): Observable<List<DetailLeague>>
    fun getTeamDetail(id : String): Observable<List<Team>>
    fun getSearchMatch(query : String): Observable<List<Match>>
}