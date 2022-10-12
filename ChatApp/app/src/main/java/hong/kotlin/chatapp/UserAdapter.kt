package hong.kotlin.chatapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter


class UserAdapter (val context: Context, val user : ArrayList<User>) : Adapter<UserAdapter.UserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.user_layout, parent, false)

        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val correntUser = user[position]


    }

    override fun getItemCount(): Int {
        return  user.size
    }

    class UserViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val textName =itemView.findViewById<View>(R.id.name)
    }
}