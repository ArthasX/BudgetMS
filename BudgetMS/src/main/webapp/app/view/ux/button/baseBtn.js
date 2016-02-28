Ext.define('BudgetMS.view.ux.button.baseBtn', {
	extend : 'Ext.button.Button',
	// alias:'widget.baseBtn',
	// .init..configs..
	listeners : {
	// init listeners
	// 'click' : function(btn, e, eOpts) {
	// var record = btn.up('window').down('form').getForm()
	// .getFieldValues();
	// console.log(record);
	// var tabpanel = Ext.getCmp('mainTabpanel');
	// var tab = tabpanel.getActiveTab();
	// var grid = tab.down('gridview');
	// var url = btn.action;
	// doCRUDAjax(record, url, grid);
	// }
	},
	test : function() {
		console.log(this, this.test);
	},
	doCRUDAjax : function(params, url, grid,win) {
		// debugger;
		console.log('store beforeload')
		console.log(params);
		var p = {
			obj : Ext.JSON.encode(params)
		};
		Ext.Ajax.request({
			url : url,
			params : p,
			success : function(response) {
				var text = response.responseText;
				console.log(text);
				var msg = Ext.JSON.decode(text);
				if (msg.status == "success") {
					Ext.Msg.alert(msg.status, msg.msg);
					grid.store.reload();
					win.close();
				} else
					Ext.Msg.alert(msg.status, msg.msg);
			},
			failure : function(response) {
				Ext.Msg.alert('状态', response.statusText + "->timedout:"
						+ response.timedout + " 请联系管理员");

			}
		});
	}

})