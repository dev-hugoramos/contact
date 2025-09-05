package com.hugoramos.pokedexapp.ui.main.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hugoramos.pokedexapp.ui.main.models.PokemonModel

class PokemonAdapter(private  val pokemonList: MutableList<PokemonModel>) : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    inner class PokemonViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}