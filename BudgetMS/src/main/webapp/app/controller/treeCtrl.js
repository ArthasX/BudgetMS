Ext.define('BudgetMS.controller.treeCtrl', {
	extend : 'Ext.app.Controller',
	stores : [ 'treeMenuStore' ],
	views : [ 'ux.treeMenu' ],
	models : [],
	init : function() {
		this.control({
			'treeMenu' : {
				itemclick : this.treeItemClick
			// itemdblclicl: this.expand
			}
		});
	},
	treeItemClick : function(tr, record, item, index, e, eOpts) {
		// console.log(record.raw);
		// console.log(tr.ownerCt);
		debugger;
		var treeNode = record.raw;
		var id = treeNode.id;
		var name = treeNode.name;
		var text = treeNode.text;
		var tabs = tr.ownerCt.ownerCt.ownerCt.child('tabpanel');
		var tab = tabs.getComponent(id);
		console.log("id:", id, "text:", text, "tab:", tab);
		try {
			if (!tab) {
				tabs.add({
					id : id,
					name : name,
					closable : true,
					title : text,
					iconCls : id,
					xtype : id,
					closeAction : 'hide'
				});
				tabs.setActiveTab(tabs.getComponent(id));
			} else {
				tabs.setActiveTab(tab);
			}
		} catch (e) {
			console.log(e);
		}
	},
	expand : function(tr, record) {
		// console.log(record.data.id);
		tr.expandNode(record);
	}
});