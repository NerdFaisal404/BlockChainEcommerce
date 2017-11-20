package com.fivenodes.ecommerce.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.fivenodes.ecommerce.R;
import com.fivenodes.ecommerce.activity.CartActivity;

// adapter class for custom order list
public class CartAdapter extends BaseAdapter {
		private LayoutInflater inflater;
		
		public CartAdapter(Context context) {
			inflater = LayoutInflater.from(context);
		}
		
		public int getCount() {
			// TODO Auto-generated method stub
			return CartActivity.Menu_ID.size();
		}

		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder holder;
			
			if(convertView == null){
				convertView = inflater.inflate(R.layout.order_list_item, null);
				holder = new ViewHolder();
				holder.txtMenuName = (TextView) convertView.findViewById(R.id.txtMenuName);
				holder.txtQuantity = (TextView) convertView.findViewById(R.id.txtQuantity);
				holder.txtPrice = (TextView) convertView.findViewById(R.id.txtPrice);
				
				convertView.setTag(holder);
			}else{
				holder = (ViewHolder) convertView.getTag();
			}
			
			
			holder.txtMenuName.setText(CartActivity.Menu_name.get(position));
			holder.txtQuantity.setText(String.valueOf(CartActivity.Quantity.get(position)));
			holder.txtPrice.setText(CartActivity.Sub_total_price.get(position)+" "+ CartActivity.Currency);
			
			return convertView;
		}
		
		static class ViewHolder {
			TextView txtMenuName, txtQuantity, txtPrice;
		}
		
		
	}